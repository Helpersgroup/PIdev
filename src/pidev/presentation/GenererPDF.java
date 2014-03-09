package pidev.presentation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class GenererPDF {

    
    public  boolean genrer(int id_Annonce) {
        // - Paramètres de connexion à la base de données
        String url = "jdbc:mysql://41.231.22.153:3306/helpers";     
        String login = "helper"; 
        String  password = "helper";
        Connection connection;
        try {
            // - Connexion à la base
            connection=DriverManager.getConnection(url, login, password);
            // - Chargement et compilation du rapport
            JasperDesign jasperDesign = JRXmlLoader.load("D:\\ESPRIT\\PIDev\\p\\PIdev\\classic.jrxml");
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            
            // - Paramètres à envoyer au rapport
            Map  parameters = new HashMap();
            parameters.put("id_Annonce", id_Annonce);
            // - Execution du rapport
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);
            // - Création du rapport au format PDF
            //JasperViewer.viewReport (jasperPrint);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "D:\\ESPRIT\\PIDev\\p\\PIdev\\classic.pdf");
            return true;
        }

        catch (JRException e) {
            System.out.println("erreur de compilation"+ e.getMessage());
            
         } catch (SQLException e) {
            System.out.println("erreur SQL"+e.getMessage());
            
        }
        return false;
}

}
