package recursos;

public enum Status {
    ABERTO("Aberto"),
    ANDAMENTO("Em Andamento"),
    FECHADO("Fechado");

    
    private String status;


    private Status(String status) {
        this.status = status;
    }

    public String getChamadoTicket() {
        return status;
    }

    public void setChamadoTicket(String chamadoTicket) {
        this.status = status;
    }
    
    
}

