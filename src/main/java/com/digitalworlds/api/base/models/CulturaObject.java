package com.digitalworlds.api.base.models;

public class CulturaObject {
    private String usuarios;
    private String organismos;
    private String programas;
    private String museos;
    private String institutos;
    private String tramites;
    private String convocatorias;

    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    public void setOrganismos(String organismos) {
        this.organismos = organismos;
    }

    public void setProgramas(String programas) {
        this.programas = programas;
    }

    public void setMuseos(String museos) {
        this.museos = museos;
    }

    public void setInstitutos(String institutos) {
        this.institutos = institutos;
    }

    public String getUsuarios() {
        return usuarios;
    }

    public String getOrganismos() {
        return organismos;
    }

    public String getProgramas() {
        return programas;
    }

    public String getMuseos() {
        return museos;
    }

    public String getInstitutos() {
        return institutos;
    }

    public String getTramites() {
        return tramites;
    }

    public String getConvocatorias() {
        return convocatorias;
    }

    public void setTramites(String tramites) {
        this.tramites = tramites;
    }

    public void setConvocatorias(String convocatorias) {
        this.convocatorias = convocatorias;
    }

    public CulturaObject() {}
}
