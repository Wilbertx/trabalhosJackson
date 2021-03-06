using System;
using System.Collections.Generic;
using System.Linq;
using Models;

namespace Controllers
{
    public class AgendamentoController
    {
        public static Agendamento InserirAgendamento(
            int IdPaciente,
            int IdDentista,
            int IdSala,
            DateTime Data
            //int IdProcedimento
        )
        {
            PacienteController.GetPaciente(IdPaciente);
            DentistaController.GetDentista(IdDentista);
            SalaController.GetSala(IdSala);
            //ProcedimentoController.GetProcedimento(IdProcedimento);

            if (Data == null || Data <= DateTime.Now)
            {
                throw new Exception("Data não pode ser inferior a data atual.");
            }

            if (GetConflito(
                0,
                IdDentista,
                Data
                //IdProcedimento
            ))
            {
                throw new Exception("Já existe um agendamento para este horário");
            }

            return new Agendamento(IdPaciente, IdDentista, IdSala, Data /*IdProcedimento*/);
        }

        private static bool GetConflito(
            int IdAtual,
            int IdDentista,
            DateTime Data
            //int IdProcedimento
        )
        {
            IEnumerable<Agendamento> agendamentos =
                from Agendamento in Agendamento.GetAgendamentos()
                    where Agendamento.Data == Data 
                        && Agendamento.IdDentista == IdDentista
                        && Agendamento.Id != IdAtual
                    select Agendamento;

            return agendamentos.Count() > 0;
        }

        public static Agendamento AlterarAgendamento(
            int Id,
            int IdSala,
            DateTime Data
            //string Procedimento
        )
        {
            Agendamento agendamento = GetAgendamento(Id);

            SalaController.GetSala(IdSala);

            if (Data == null || Data < DateTime.Now)
            {
                throw new Exception("Data inválida");
            }

            if (GetConflito(
                agendamento.Id,
                agendamento.IdDentista,
                Data
                //agendamento.IdProcedimento
            ))
            {
                throw new Exception("Já existe um agendamento para este horário");
            }

            agendamento.IdSala = IdSala;
            agendamento.Data = Data;
            //.IdProcedimento = IdProcedimento;

            return agendamento;
        }
        public static Agendamento ExcluirAgendamento(
            int Id
        )
        {
            Agendamento agendamento = GetAgendamento(Id);
            Agendamento.RemoverAgendamento(agendamento);
            return agendamento;
        }
        public static List<Agendamento> VisualizarAgendamentos()
        {
            return Agendamento.GetAgendamentos();
        }
        public static Agendamento GetAgendamento(
            int Id
        )
        {
            Agendamento agendamento = (
                from Agendamento in Agendamento.GetAgendamentos()
                    where Agendamento.Id == Id
                    select Agendamento
            ).First();

            if (agendamento == null)
            {
                throw new Exception("Agendamento não encontrado.");
            }

            return agendamento;
        }

        public static IEnumerable<Agendamento> GetAgendamentosPorPaciente(int IdPaciente)
        {
            return Agendamento.GetAgendamentos()
                .Where(Agendamento => Agendamento.IdPaciente == IdPaciente);
        }

        public static Agendamento ConfirmarAgendamento(int Id)
        {
            Agendamento agendamento = GetAgendamento(Id);

            if (agendamento.IdPaciente != Auth.Paciente.Id)
            {
                throw new Exception("Não é possível confirmar esse agendamento");
            }
            agendamento.Confirmado = true;
            return agendamento;
        }
    }
}