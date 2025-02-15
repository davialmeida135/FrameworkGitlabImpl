package com.projectmanager.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("GITLAB_TASK")
public class TarefaTipoB extends Tarefa {
    String supervisorResponsavel;
    String tempoEstimado;
    String prioridade;

    // Getter e Setter para supervisorResponsavel
    public String getSupervisorResponsavel() {
        return supervisorResponsavel;
    }

    public void setSupervisorResponsavel(String supervisorResponsavel) {
        this.supervisorResponsavel = supervisorResponsavel;
    }

    // Getter e Setter para tempoEstimado
    public String getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(String tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    // Getter e Setter para prioridade
    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public int getPrioridadeValor() {
        switch (prioridade) {
            case "BAIXA":
                return 1;
            case "MÉDIA":
                return 2;
            case "ALTA":
                return 3;
            default:
                return 1;
        }
    }

    @Override
    public boolean isGithubTarefa() {
        return false;
    }

    @Override
    public boolean isGitlabTarefa() {
        return true;
    }
}
