import java.util.logging.Logger;

public class LogInfo {

    private final static Logger logger = Logger.getLogger("");

    public void getlogInfo() {
        logger.info("лог, который записывает важные действия в приложении. Это не ошибки, это не предостережение, это ожидаемые действия системы;");
    }

}
