/*
 * FCUeb03NEUApp.java
 */

package fcueb03neu;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class FCUeb03NEUApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new FCUeb03NEUView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of FCUeb03NEUApp
     */
    public static FCUeb03NEUApp getApplication() {
        return Application.getInstance(FCUeb03NEUApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(FCUeb03NEUApp.class, args);
    }
}
