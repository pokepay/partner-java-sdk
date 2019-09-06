package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateCheck;
import jp.pokepay.partnerapi.request.Request;
import jp.pokepay.partnerapi.schema.Check;

import java.io.File;

public class Example {
    public static void main(String[] args) {
        try {
            PartnerAPI client = new PartnerAPI(new File("/Users/user/.pokepay/config.properties"));
            Request request = new CreateCheck("c3ee6f56-b8f1-4659-9410-503cbe234462");
            Check check = (Check) client.send(request);
            System.out.println(check.getId());
        } catch (PartnerRequestError error) {
            System.out.println(error.getType());
            System.out.println(error.getMessage());
            System.out.println(error.getRawJson());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
