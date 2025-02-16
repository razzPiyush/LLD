package Structural.Proxy;

public class DatabaseProxy implements Database {
    private RealDatabase realDatabase;
    private boolean isAdmin;

    public DatabaseProxy(String userRole) {
        this.isAdmin = "ADMIN".equalsIgnoreCase(userRole);
    }

    @Override
    public void query(String sql) {
        if (isAdmin) {
            if (realDatabase == null) {
                realDatabase = new RealDatabase();
            }
            realDatabase.query(sql);
        } else {
            System.out.println("Access Denied: Insufficient permissions to execute the query.");
        }
    }
}
