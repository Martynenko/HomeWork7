public class Logger {

    public enum Level {NONE, ERROR, WARNING, INFO, DEBUG}

    private Level level = Level.NONE;

    public void setLevel(Level l) {
        level = l;
    }

    public String info(String m) {
        if (Level.INFO.compareTo(level) <= 0) {
            format("INFO", m);
        }
        return m;
    }

    public String debug(String m) {
        if (Level.DEBUG.compareTo(level) <= 0) {
            format("DEBUG", m);
        }
        return m;
    }

    public String warn(String m) {
        if (Level.WARNING.compareTo(level) <= 0) {
            format("WARNING", m);
        }
        return m;
    }


    public String error(String m) {
        if (Level.ERROR.compareTo(level) <= 0) {
            format("ERROR", m);
        }
        return m;
    }

    public void format(String type, String m) {

    }

}
