public class TurnoVirtual {
    
    //ESTA CLASE NO TIENE MAIN
    //INSERTE LOS ATRIBUTOS
    private String[] turnos;
    private String[] turnosPerdidos;
    private boolean estadoTurnoVirtual;
    private int turnoEnAtencion;
    private int cantidadTurnosAtendidos;
     
    //INSERTE EL MÉTODO CONSTRUCTOR
     public TurnoVirtual (String[] turnos) {
        
        this.turnos = turnos;
        this.turnosPerdidos = new String[turnos.length];
        for (int i = 0; i < turnos.length; i++) 
        { 
           turnosPerdidos[i] = " ";
        }
        this.estadoTurnoVirtual = true;
        this.turnoEnAtencion =0;
        this.cantidadTurnosAtendidos = 1;
        
    }
        
    //GETTERS Insertados

    public String[] getTurnos() {
        return turnos;
    }

    public String[] getTurnosPerdidos() {
        return turnosPerdidos;
    }

    public boolean isEstadoTurnoVirtual() {
        return estadoTurnoVirtual;
    }

    public int getTurnoEnAtencion() {
        return turnoEnAtencion;
    }

    public int getCantidadTurnosAtendidos() {
        return cantidadTurnosAtendidos;
    }
    
     //SETTERS Insertados

    public void setTurnos(String[] turnos) {
        this.turnos = turnos;
    }

    public void setTurnosPerdidos(String[] turnosPerdidos) {
        this.turnosPerdidos = turnosPerdidos;
    }

    public void setEstadoTurnoVirtual(boolean estadoTurnoVirtual) {
        this.estadoTurnoVirtual = estadoTurnoVirtual;
    }

    public void setTurnoEnAtencion(int turnoEnAtencion) {
        this.turnoEnAtencion = turnoEnAtencion;
    }

    public void setCantidadTurnosAtendidos(int cantidadTurnosAtendidos) {
        this.cantidadTurnosAtendidos = cantidadTurnosAtendidos;
    }
    
    //INSERTE LOS DEMÁS MÉTODOS
    public void atenderProximoTurno () {
    
        if (estadoTurnoVirtual == true){
            setTurnoEnAtencion(turnoEnAtencion+1);
            setCantidadTurnosAtendidos(cantidadTurnosAtendidos+1);
            
             }
    }
    
    
    
    public void cambiarEstadoTurno () {
        
        if (estadoTurnoVirtual == true) {
            setEstadoTurnoVirtual (false);
        } else {
            setEstadoTurnoVirtual (true);
            //setCantidadTurnosAtendidos (+1);
        }
    
    }
    
    
    

    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    
public void agregarTurnoPerdido() {
        for (int i = 0; i < turnosPerdidos.length; i++) {
            if (" ".equals(turnosPerdidos[i])) {
                turnosPerdidos[i] = turnos[turnoEnAtencion];
                break;
            }
        }
    }  

    

}