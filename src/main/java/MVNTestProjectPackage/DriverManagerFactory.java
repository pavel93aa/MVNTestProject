/*Класс DriverManagerFactory содержит метод getDriverManager()*/

package MVNTestProjectPackage;

public class DriverManagerFactory {

    public static DriverManager getDriverManager(DriverType type) {
        DriverManager driverManager = null;

        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case IE:
                driverManager = new InternetExplorerDriverManager();
                break;
        }
        return driverManager;
    }
}