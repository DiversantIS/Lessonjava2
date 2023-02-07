public class task3 {
    public static void main(String[] args) {

        String jsonString = "[{\"last name\":\"Ivanov\",\"grade\":\"5\",\"subject\":\"Математика\"},"
        
        + "{\"last name\":\"Petrova\",\"grade\":\"4\",\"subject\":\"Информатика\"},"
        
        + "{\"last name\":\"Krasnov\",\"grade\":\"5\",\"subject\":\"Физика\"}]";
        
        StringBuilder sb = new StringBuilder();
        
        String[] splitString = jsonString.split("\\{");

        for (int i = 1; i < splitString.length; i++) {
            String[] studentInfo = splitString[i].replace("}]","").split("\",\"");
            
            sb.append("Студент " + studentInfo[0].split(":")[1].replace("\"", "") + " получил " + studentInfo[1].split(":")[1].replace("\"", "") + " по предмету " + studentInfo[2].split(":")[1].replace("\"", "").replace("},", "") + ".\n");
        }
        
        System.out.println(sb.toString());

}
}
