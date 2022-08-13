package ssm;

import java.sql.Connection;
import java.sql.DriverManager;

class JdbcTest {
    public static void main(String args[]) {

        // String driverName="oracle.jdbc.driver.OracleDriver";//加载驱动
        // String dbURL="jdbc:oracle:thin:@127.0.0.1:1521:ORCL";//localhost代表本机，也可以是 127.0.0.1，可以填写具体IP

        String driverName = "com.mysql.jdbc.Driver";//加载驱动
        String dbURL = "jdbc:mysql://localhost:3306/xiaomissm?useSSL=false&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";//localhost代表本机，也可以是 127.0.0.1，可以填写具体IP

        // String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";//这是要连接的数据库加载器
        // String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=Library";//这是要连接的端口号以及数据库名称
        String userName = "root";//用户名
        String userpwd = "123";//用户密码
        try {
            Class.forName(driverName);
            System.out.println("加载驱动成功");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println("加载驱动失败");
        }
        try {
            Connection dbConn = DriverManager.getConnection(dbURL, userName, userpwd);
            System.out.println("连接数据库成功");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println("数据库连接失败");
        }
    }
}
