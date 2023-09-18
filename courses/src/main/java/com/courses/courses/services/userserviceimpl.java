package com.courses.courses.services;
//import com.courses.courses.DTO.Student;
import com.courses.courses.DTO.Student;
import com.courses.courses.courseDAO.userdao;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JsonDataSource;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import java.io.*;
import java.nio.file.Paths;
import java.util.*;

    @Service
    public class userserviceimpl implements userservice {

        @Autowired
        private userdao dao;


        public class FilesUtils {

            public static String getPlatformBasedParentDir() {
                // Get the platform-specific parent directory path
                String os = System.getProperty("os.name").toLowerCase();
                String parentDir;

                if (os.contains("win")) {
                    // Windows
                    parentDir = "C:\\your\\windows\\parent\\directory";
                } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
                    // Unix/Linux/Mac
                    parentDir = "/your/unix/macosx/parent/directory";
                } else {
                    // Other platforms
                    parentDir = "/default/parent/directory";
                }

                return parentDir;
            }
        }


        public String jasperReport() {



            try {

               // List<Student> student = new ArrayList<>();
//                Student studentdata = new Student();
//                studentdata.setDate("24");
//                studentdata.setChequeNo("3245");
//                studentdata.setName("dsfadfv");
//                studentdata.setAmount(654);
//                studentdata.setCategory("iop");
//                studentdata.setBalance(3257);
//
//                Student studentdata2 = new Student();
//
//                studentdata2.setDate("24");
//                studentdata2.setChequeNo("3245");
//                studentdata2.setName("dsfadfv");
//                studentdata2.setAmount(654);
//                studentdata2.setCategory("iop");
//                studentdata2.setBalance(3257);
//
//                student.add(studentdata);
//                student.add(studentdata2);

                List<JasperPrint> JasperPrint = new ArrayList<>();
                JasperReport filenameDesign = JasperCompileManager.compileReport(
                        JRXmlLoader.load(new ClassPathResource("Student Fees Details.jrxml").getInputStream()));


                Map<String, Object> parameters = new HashMap<>();


                //Create a JSON data source
                String studentjson = "[\n" +
                        " {\n" +
                        "  \"date\": \"04\\/02\\/2023\",\n" +
                        "  \"chequeNo\": 43627528,\n" +
                        "  \"name\": \"Aakash\",\n" +
                        "  \"amount\": 133300,\n" +
                        "  \"category\": \"fees\",\n" +
                        "  \"balance\": 55000\n" +
                        " },\n" +
                        " {\n" +
                        "  \"date\": \"04\\/02\\/2023\",\n" +
                        "  \"chequeNo\": 54365783,\n" +
                        "  \"name\": \"Sanjay\",\n" +
                        "  \"amount\": 133300,\n" +
                        "  \"category\": \"fees\",\n" +
                        "  \"balance\": 66000\n" +
                        " },\n" +
                        " {\n" +
                        "  \"date\": \"04\\/05\\/2023\",\n" +
                        "  \"chequeNo\": 45432963,\n" +
                        "  \"name\": \"Pawan\",\n" +
                        "  \"amount\": 133300,\n" +
                        "  \"category\": \"fees\",\n" +
                        "  \"balance\": 23000\n" +
                        " },\n" +
                        " {\n" +
                        "  \"date\": \"04\\/05\\/2023\",\n" +
                        "  \"chequeNo\": 34260890,\n" +
                        "  \"name\": \"Akshay\",\n" +
                        "  \"amount\": 133300,\n" +
                        "  \"category\": \"fees\",\n" +
                        "  \"balance\": 23000\n" +
                        " },\n" +
                        " {\n" +
                        "  \"date\": \"04\\/06\\/2023\",\n" +
                        "  \"chequeNo\": 45325432,\n" +
                        "  \"name\": \"Salman\",\n" +
                        "  \"amount\": 133300,\n" +
                        "  \"category\": \"fees\",\n" +
                        "  \"balance\": 43000\n" +
                        " },\n" +
                        " {\n" +
                        "  \"date\": \"04\\/06\\/2023\",\n" +
                        "  \"chequeNo\": 84579273,\n" +
                        "  \"name\": \"Ankit\",\n" +
                        "  \"amount\": 133300,\n" +
                        "  \"category\": \"fees\",\n" +
                        "  \"balance\": 43000\n" +
                        " },\n" +
                        " {\n" +
                        "  \"date\": \"04\\/09\\/2023\",\n" +
                        "  \"chequeNo\": 34194572,\n" +
                        "  \"name\": \"Sonu\",\n" +
                        "  \"amount\": 133300,\n" +
                        "  \"category\": \"fees\",\n" +
                        "  \"balance\": 27000\n" +
                        " },\n" +
                        " {\n" +
                        "  \"date\": \"04\\/09\\/2023\",\n" +
                        "  \"chequeNo\": 15392578,\n" +
                        "  \"name\": \"Anshul\",\n" +
                        "  \"amount\": 133300,\n" +
                        "  \"category\": \"fees\",\n" +
                        "  \"balance\": 29000\n" +
                        " },\n" +
                        " {\n" +
                        "  \"date\": \"03\\/09\\/2023\",\n" +
                        "  \"chequeNo\": 32510745,\n" +
                        "  \"name\": \"Anurag\",\n" +
                        "  \"amount\": 133300,\n" +
                        "  \"category\": \"fees\",\n" +
                        "  \"balance\": 31000\n" +
                        " },\n" +
                        " {\n" +
                        "  \"date\": \"04\\/09\\/2023\",\n" +
                        "  \"chequeNo\": 32193561,\n" +
                        "  \"name\": \"Yash\",\n" +
                        "  \"amount\": 133300,\n" +
                        "  \"category\": \"fees\",\n" +
                        "  \"balance\": 31000\n" +
                        " }\n" +
                        "]";
                ObjectMapper objectMapper = new ObjectMapper();
                List<Student> students = objectMapper.readValue(studentjson,  new TypeReference<List<Student>>() {});


                JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(students);



                //  JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(student);


              //  parameters.put("studentDetailsbean", dataSource);


                parameters.put("studentDetailsbean",dataSource);
                parameters.put("educationLogo","C:\\Users\\Deepanshu Singh\\OneDrive\\Desktop\\projects\\courses\\src\\main\\resources\\static\\education-logo-template.jpeg.jpeg");

                JasperPrint filename = JasperFillManager.fillReport(filenameDesign, parameters, new JREmptyDataSource());
                JasperPrint.add(filename);

                createJasperReport(JasperPrint);


            } catch (JRException | IOException e) {
                throw new RuntimeException(e);
            }
            return "generated";
        }

        public void createJasperReport(List<JasperPrint> jasperPrint)
                throws JRException, FileNotFoundException {

            try {



                    String excelOutputPath = Paths.get(FilesUtils.getPlatformBasedParentDir(), "report").toString();

                    boolean b = new File(excelOutputPath + "/" + "userAbc").mkdirs();
                    Map<String, Object> parameters = new LinkedHashMap<>();
                    String destFile = excelOutputPath + "/" + "userAbc" + "/";
                    String destFile2 = excelOutputPath + "/" + "userAbc" + "/";
                    String destFile3 = excelOutputPath + "/" + "userAbc" + "/";
                    String fileName = "123" + "users.xlsx";
                    destFile = Paths.get(destFile, fileName).toString();
                    System.out.println(destFile);

                    File outputFile = new File("student.xlsx");
                    JRXlsxExporter exporter = new JRXlsxExporter();
                    exporter.setParameter(JRXlsExporterParameter.JASPER_PRINT_LIST, jasperPrint);
                    exporter.setParameter(JRXlsExporterParameter.OUTPUT_FILE_NAME, destFile);
                    exporter.setParameter(JRXlsExporterParameter.IS_COLLAPSE_ROW_SPAN, false);
                    exporter.setParameter(JRXlsExporterParameter.CREATE_CUSTOM_PALETTE, true);
                    exporter.setParameter(JRXlsExporterParameter.IS_DETECT_CELL_TYPE, true);
                    exporter.setParameter(JRXlsExporterParameter.IS_IGNORE_CELL_BACKGROUND, false);
                    exporter.setParameter(JRXlsExporterParameter.IS_IGNORE_CELL_BORDER, false);
                    exporter.setParameter(JRXlsExporterParameter.IS_FONT_SIZE_FIX_ENABLED, false);
                    exporter.setParameter(JRXlsExporterParameter.IS_IGNORE_GRAPHICS, false);
                    exporter.setParameter(JRXlsExporterParameter.IS_IMAGE_BORDER_FIX_ENABLED, true);
                    exporter.setParameter(JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND, true);
                    exporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, false);
                    exporter.exportReport();
                    String fileName1 = outputFile.getName();
                    InputStream inputStream = new FileInputStream(destFile);

            } catch (JRException e) {
                // Handle JasperReports exception
                e.printStackTrace();
            } catch (Exception ex) {
                // Handle other exceptions
                ex.printStackTrace();
            }
        }
    }



