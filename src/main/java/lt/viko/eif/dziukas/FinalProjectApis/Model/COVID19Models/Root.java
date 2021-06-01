package lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models;

import java.util.List;

public class Root {
    private List<Response> response;

    public Root() {

    }

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Root{" +
                "response=" + response +
                '}';
    }
}
