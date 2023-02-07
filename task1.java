public class task1 {
    public static void main(String[] args) {
        String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";

        StringBuilder sb = new StringBuilder();
        sb.append("select * from students where ");
        String[] arr = str.split(",");
        for (String s : arr) {
            String key = s.substring(s.indexOf("'") + 1, s.indexOf(":") - 1);
            String value = s.substring(s.indexOf(":") + 2, s.lastIndexOf("'"));
            if (!value.equals("null")) {
                sb.append(key + "=" + "'" + value + "'" + " and ");
            }
        }
        sb.delete(sb.length() - 5, sb.length());
        System.out.println(sb);
    }
}
