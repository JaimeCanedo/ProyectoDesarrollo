package edu.is2024.rh.controlador;

import org.slf4j.Logger;
import java.util.List;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.is2024.rh.modelo.Empleado;
import edu.is2024.rh.repositorio.EmpleadoRepositorio;
import edu.is2024.rh.servicio.IEmpleadoServicio;

@RestController
@RequestMapping("rh-app")
@CrossOrigin(value = "http://localhost:3000")

public class EmpleadoControlador {
    private static final Logger logger = LoggerFactory.getLogger(EmpleadoControlador.class);

    @Autowired
    private IEmpleadoServicio iEmpleadoServicio;

    @GetMapping("/empleados")
    public List<Empleado> obtenerTodosLosEmpleados() {
        return iEmpleadoServicio.listarEmpleados();
    }

    @PostMapping("/empleados")
    public Empleado crearEmpleado(@RequestBody Empleado empleado) {
        return iEmpleadoServicio.guardarEmpleado(empleado);
    }

    @GetMapping("/empleados/{idEmpleado}/")
    public Empleado obtenerEmpleadoPorId(@PathVariable Integer id) {
        return iEmpleadoServicio.buscarEmpleado(id);
    }

}
