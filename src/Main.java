

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        System.out.println(logger.info("INFO: лог, который записывает важные действия в приложении. Это не ошибки, это не предостережение, это ожидаемые действия системы;"));
        System.out.println(logger.debug("DEBUG: логи, необходимые для отладки приложения. Для уверенности в том, что система делает именно то, что от нее ожидают, или описания действия системы: “method1 начал работу”;"));
        System.out.println(logger.warn("WARN: обозначаются логи, которые содержат предостережение. Произошло неожиданное действие, несмотря на это система устояла и выполнила запрос;"));
        System.out.println(logger.error("ERROR: уровень ошибок, когда есть проблемы, которые нужно решить. Ошибка не останавливает работу приложения в целом. Остальные запросы могут работать корректно;"));
    }
}
