package edu.is2024.rh.servicio;

import java.util.List;
import edu.is2024.rh.modelo.Empleado;

public interface IEmpleadoServicio {
    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleado(Integer idEmpleado);

    public Empleado guardarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);
}
