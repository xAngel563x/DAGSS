package es.uvigo.dagss.recetas;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.uvigo.dagss.recetas.daos.AdministradorDAO;
import es.uvigo.dagss.recetas.daos.CentroSaludDAO;
import es.uvigo.dagss.recetas.daos.CitaDAO;
import es.uvigo.dagss.recetas.daos.FarmaciaDAO;
import es.uvigo.dagss.recetas.daos.MedicamentoDAO;
import es.uvigo.dagss.recetas.daos.MedicoDAO;
import es.uvigo.dagss.recetas.daos.PacienteDAO;
import es.uvigo.dagss.recetas.daos.PrescripcionDAO;
import es.uvigo.dagss.recetas.daos.RecetaDAO;
import es.uvigo.dagss.recetas.entidades.Administrador;
import es.uvigo.dagss.recetas.entidades.CentroSalud;
import es.uvigo.dagss.recetas.entidades.Cita;
import es.uvigo.dagss.recetas.entidades.Farmacia;
import es.uvigo.dagss.recetas.entidades.Medicamento;
import es.uvigo.dagss.recetas.entidades.Medico;
import es.uvigo.dagss.recetas.entidades.Paciente;
import es.uvigo.dagss.recetas.entidades.Prescripcion;
import es.uvigo.dagss.recetas.entidades.Receta;

@SpringBootApplication
public class RecetasApplication implements CommandLineRunner {

    @Autowired
    AdministradorDAO adminDAO;

    @Autowired
    CentroSaludDAO centrosaludDAO;

    @Autowired
    CitaDAO citaDAO;

    @Autowired
    FarmaciaDAO farmaciaDAO;

    @Autowired
    MedicamentoDAO medicamentoDAO;

    @Autowired
    MedicoDAO medicoDAO;

    @Autowired
    PacienteDAO pacienteDAO;

    @Autowired
    PrescripcionDAO prescripcionDAO;

    @Autowired
    RecetaDAO recetaDAO;



    public static void main(String[] args) {
        SpringApplication.run(RecetasApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        crearEntidades();
    }

    private void crearEntidades(){

        Farmacia f1 = new Farmacia("Farmacia Ourense", "Jose Angel", "Fernandez", "23456789P", "87635937503",
                "Calle Nuño de Ousende Nº1", "464923965", "farmaciaourense@gmail.com","FarmaciaOurense", "our3ns3");
        Farmacia f2 = new Farmacia("Farmacia Pontevedra", "Jose Francisco", "Alonso", "21720517Y", "6747834976",
                "Calle Juan Manuel Nº1", "200566899", "farmaciaponte@gmail.com","FarmaciaPonte", "P0nt3");
        Farmacia f3 = new Farmacia("Farmacia Vigo", "Manuel", "Gonzalez", "22994477G", "7648930248",
                "Calle Gran Via Nº1", "222222222", "farmaciavigo@gmail.com","FarmaciaVigo","v1G0");
        
        f1 = farmaciaDAO.save(f1);
        f2 = farmaciaDAO.save(f2);
        f3 = farmaciaDAO.save(f3);

        CentroSalud c1 = new CentroSalud("Meixoeiro", "meixoeiro@gmail.com", "Una calle de Vigo", "666999666");
        CentroSalud c2 = new CentroSalud("Cuncheiro", "cuncheiro@gmail.com", "Una calle de Vigo", "111222111");

        c1 = centrosaludDAO.save(c1);
        c2 = centrosaludDAO.save(c2);

        Medico m1 = new Medico("Jose Antonio", "Palomares", "78765645L", "6548639874", "123456789", "jose@gmail.com", c1, "JoseAntonio", "j0S3");
        Medico m2 = new Medico("Maria Antonieta", "De Lirio", "12121212U", "635235324", "111111111", "maria@gmail.com", c1, "Maria", "m4r14");
        Medico m3 = new Medico("Enrique", "Pastor", "55555555P", "262342322", "999343467", "enrique@gmail.com", c2, "Enrique", "3nr1q3");

        m1 = medicoDAO.save(m1);
        m2 = medicoDAO.save(m2);
        m3 = medicoDAO.save(m3);

        Paciente p1 = new Paciente("Antonio", "Alonso", "33333345Y", "5634BGUE65D", "111188883333", "Mi casa", "2324432045",
         "antonio@gmail.com", Date.valueOf(LocalDate.of(1986, 2, 1)), c1, m1, "Antonio", "4nT0n10");
        Paciente p2 = new Paciente("Roberto Carlos", "Perez", "10852856G", "GHWEUI7455467B", "320785671048", "Su casa", "101006666",
         "roberto@gmail.com", Date.valueOf(LocalDate.of(2003, 12, 1)), c1, m2, "Roberto", "r0b3rt0");
        Paciente p3 = new Paciente("Andres", "Alvarez", "12905016E", "7834HIFE6435T", "129620528400", "Esa casa", "101044294",
         "andres@gmail.com", Date.valueOf(LocalDate.of(2003, 11, 13)), c2, m3, "Andres", "4ndr3S");

        p1 = pacienteDAO.save(p1);
        p2 = pacienteDAO.save(p2);
        p3 = pacienteDAO.save(p3);

        Administrador a = new Administrador("Admin","admin","Administrador", "De esta aplicacion","admin@gmail.com");
        a = adminDAO.save(a);

        Cita cita1 = new Cita(Date.valueOf(LocalDate.of(2025, 2, 1)), 20, m3, p3);
        Cita cita2 = new Cita(Date.valueOf(LocalDate.of(2025, 1, 9)), 15, m1, p1);
        Cita cita3 = new Cita(Date.valueOf(LocalDate.of(2025, 4, 14)), 30, m2, p2);

        cita1 = citaDAO.save(cita1);
        cita2 = citaDAO.save(cita2);
        cita3 = citaDAO.save(cita3);

        Medicamento med1 = new Medicamento("Paracetamol", "Acetaminofen", "Kern Pharma", "Analgesicos", 1);
        Medicamento med2 = new Medicamento("Ibuprofeno", "Ibuprofen", "Bayer", "Antiinflamatorios", 2);
        Medicamento med3 = new Medicamento("Loratadina", "Loratadine", "Sanofi", "Antihistamínicos", 3);

        med1 = medicamentoDAO.save(med1);
        med2 = medicamentoDAO.save(med2);
        med3 = medicamentoDAO.save(med3);

        Prescripcion pres1 = new Prescripcion(1.5, "Tomar cada 8 horas", 
            Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.of(2025, 1, 3)), med3, p3, m3);
        Prescripcion pres2 = new Prescripcion(2.5, "Tomar uno cada 24 horas", 
            Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.of(2025, 5, 1)), med2, p2, m2);
        Prescripcion pres3 = new Prescripcion(10.5, "Tomar cada 8 horas", 
            Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.of(2025, 12, 31)), med1, p1, m1);
        
        pres1 = prescripcionDAO.save(pres1);
        pres2 = prescripcionDAO.save(pres2);
        pres3 = prescripcionDAO.save(pres3);

        Receta rec1 = new Receta(Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.of(2025, 12, 31)), 10, pres3, f3);
        Receta rec2 = new Receta(Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.of(2025, 12, 31)), 5, pres2, f3);
        Receta rec3 = new Receta(Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.of(2025, 12, 31)), 15, pres1, f2);

        rec1 = recetaDAO.save(rec1);
        rec2 = recetaDAO.save(rec2);
        rec3 = recetaDAO.save(rec3);
    }
}

