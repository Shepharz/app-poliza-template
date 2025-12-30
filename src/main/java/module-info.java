module mx.gob.isesalud.sistemapoliza {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires kotlin.stdlib;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    // 1. EL CONTROLADOR (Para que funcione el @FXML)
    // Tienes que "abrir" el paquete donde está tu Controller para que
    // javafx.fxml pueda inyectar los botones y textos.
    opens mx.gob.isesalud.sistemapoliza.ui.controllers to javafx.fxml;
    opens mx.gob.isesalud.sistemapoliza.ui to javafx.fxml;
    // 2. LA APLICACIÓN (Para que arranque la ventana)
    // Tienes que "exportar" el paquete donde está HelloApplication para que
    // javafx.graphics pueda llamar al método start().
    exports mx.gob.isesalud.sistemapoliza.ui;

    // 3. EL LAUNCHER (Opcional, pero recomendado)
    // Exportamos la raíz por si alguna otra librería necesita ver tu Launcher.
    exports mx.gob.isesalud.sistemapoliza;
}