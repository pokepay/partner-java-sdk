package jp.pokepay.partnerapi;

import jp.pokepay.partnerapi.request.CreateCheck;
import jp.pokepay.partnerapi.request.CreateTransaction;
import jp.pokepay.partnerapi.request.Request;
import jp.pokepay.partnerapi.response.Check;
import jp.pokepay.partnerapi.response.Pong;
import jp.pokepay.partnerapi.response.Transaction;

import java.io.File;

public class Example {
    public static void main(String[] args) {
        try {
            PartnerAPI client = new PartnerAPI(new File("./config.properties"));
            try {
                Request request = new CreateCheck("f785442d-e81d-453e-acdd-dc0716e4051f")
                        .setAmount(1);
                Check check = (Check) client.send(request);
                System.out.println(check.getMoneyAmount());
            } catch (BankHttpError error) {
                System.out.println(error.getType());
                System.out.println(error.getMessage());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
