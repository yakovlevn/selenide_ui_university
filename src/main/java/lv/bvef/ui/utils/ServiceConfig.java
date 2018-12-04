package lv.bvef.ui.utils;

public class ServiceConfig {

    private String webUrl;
    private String loggedInUrl;
    private String dateFormatPattern;

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getLoggedInUrl() {
        return loggedInUrl;
    }

    public void setLoggedInUrl(String loggedInUrl) {
        this.loggedInUrl = loggedInUrl;
    }

    public String getDateFormatPattern() {
        return dateFormatPattern;
    }

    public void setDateFormatPattern(String dateFormatPattern) {
        this.dateFormatPattern = dateFormatPattern;
    }
}
