package ch.so.agi.ilivalidator;

public class ValidationSettings {

    private String datafile;
    
    private String logfile;
    
    private boolean valid;
    
    public ValidationSettings() {}

    public String getDatafile() {
        return datafile;
    }

    public void setDatafile(String datafile) {
        this.datafile = datafile;
    }

    public String getLogfile() {
        return logfile;
    }

    public void setLogfile(String logfile) {
        this.logfile = logfile;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "ValidationSettings [datafile=" + datafile + ", logfile=" + logfile + ", valid=" + valid + "]";
    }
}
