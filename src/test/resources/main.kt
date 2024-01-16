import org.openqa.selenium.WebDriver
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.edge.EdgeOptions
import java.nio.file.FileSystems
import java.nio.file.Files
import java.nio.file.StandardCopyOption

fun main() {
    // Ruta predeterminada del controlador de Edge
    val defaultEdgeDriverPath = "msedgedriver.exe"

    // Ruta alternativa del controlador de Edge
    val alternativeEdgeDriverPath = "C:\\ProyectosJAVA\\AutomatizacionTestin\\src\\test\\resources\\driver\\msedgedriver.exe"

    try {
        // Intentar inicializar el WebDriver con el controlador predeterminado
        val edgeDriver = initializeEdgeDriver(defaultEdgeDriverPath)
    } catch (e: Exception) {
        // Si hay una excepción, copiar el controlador desde la ruta alternativa y volver a intentar
        copyDriverFile(alternativeEdgeDriverPath, defaultEdgeDriverPath)
        val edgeDriver = initializeEdgeDriver(defaultEdgeDriverPath)
    }
}

fun initializeEdgeDriver(driverPath: String): WebDriver {
    val edgeOptions = EdgeOptions()
    edgeOptions.addArguments(
        "start-maximized",
        "test-type",
        "no-sandbox",
        "lang=es",
        "disable-popup-blocking",
        "disable-download-notification",
        "ignore-certificate-errors",
        "allow-running-insecure-content",
        "disable-translate",
        "always-authorize-plugins",
        "disable-extensions",
        "remote-allow-origins=*"
    )
    System.setProperty("webdriver.edge.driver", driverPath)
    return EdgeDriver(edgeOptions)
}

fun copyDriverFile(sourcePath: String, destinationPath: String) {
    val source = FileSystems.getDefault().getPath(sourcePath)
    val destination = FileSystems.getDefault().getPath(destinationPath)
    Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING)
}
