import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    System.out.println("============================================================" );
        
    System.out.println("Creando Objeto turnoVirtual1" );
        System.out.println("============================================================" );
        
        String[] cola = {"A0", "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11"};
        TurnoVirtual turnoVirtual1 = new TurnoVirtual(cola);
        
        
        System.out.println("Turnos: " + Arrays.toString(turnoVirtual1.getTurnos()));
        System.out.println("Turnos Perdidos: " + Arrays.toString(turnoVirtual1.getTurnosPerdidos()));
        System.out.println("Estado del Turno Virtual: " + turnoVirtual1.isEstadoTurnoVirtual());
        System.out.println("Turno en Atención: " + turnoVirtual1.getTurnoEnAtencion());
        System.out.println("Cantidad de turnos atendidos: " + turnoVirtual1.getCantidadTurnosAtendidos());
        
        
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
        
        
        System.out.println("============================================================" );
        System.out.println("Se Adelantan 4 Turnos" );
        System.out.println("============================================================" );
        
        System.out.println("Turnos: " + Arrays.toString(turnoVirtual1.getTurnos()));
        System.out.println("Turnos Perdidos: " + Arrays.toString(turnoVirtual1.getTurnosPerdidos()));
        System.out.println("Estado del Turno Virtual: " + turnoVirtual1.isEstadoTurnoVirtual());
        System.out.println("Turno en Atención: " + turnoVirtual1.getTurnoEnAtencion());
        System.out.println("Cantidad de turnos atendidos: " + turnoVirtual1.getCantidadTurnosAtendidos());
        
        System.out.println("============================================================" );
        System.out.println("Actualizar atributos del objeto turnoVirtual1" );
        System.out.println("============================================================" );
        
        turnoVirtual1.agregarTurnoPerdido();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.agregarTurnoPerdido();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.agregarTurnoPerdido();
        
        System.out.println("Turnos: " + Arrays.toString(turnoVirtual1.getTurnos()));
        System.out.println("Turnos Perdidos: " + Arrays.toString(turnoVirtual1.getTurnosPerdidos()));
        System.out.println("Estado del Turno Virtual: " + turnoVirtual1.isEstadoTurnoVirtual());
        System.out.println("Turno en Atención: " + turnoVirtual1.getTurnoEnAtencion());
        System.out.println("Cantidad de turnos atendidos: " + turnoVirtual1.getCantidadTurnosAtendidos());
        
        System.out.println("============================================================" );
        System.out.println("Validación Final del objeto turnoVirtual1" );
        System.out.println("============================================================" ); 
        
        turnoVirtual1.cambiarEstadoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.cambiarEstadoTurno();
        
        System.out.println("Turnos: " + Arrays.toString(turnoVirtual1.getTurnos()));
        System.out.println("Turnos Perdidos: " + Arrays.toString(turnoVirtual1.getTurnosPerdidos()));
        System.out.println("Estado del Turno Virtual: " + turnoVirtual1.isEstadoTurnoVirtual());
        System.out.println("Turno en Atención: " + turnoVirtual1.getTurnoEnAtencion());
        System.out.println("Cantidad de turnos atendidos: " + turnoVirtual1.getCantidadTurnosAtendidos());
  }
}