package base;// объединяем классы в один пакет

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contract {
    private String number;
    private String date;
    private List<PaymentDocument> paymentDocuments;

    public Contract(String number, String date) {
        this.number = number;// номер договора
        this.date = date;// дата заключения договора
        this.paymentDocuments = new ArrayList<>();
    }

    public String getNumber() {
        return number;//возращаем номер договора
    }

    public String getDate() {
        return date;
    }

    public List<PaymentDocument> getPaymentDocuments() {
        return paymentDocuments;
    }

    public void addPaymentDocument(PaymentDocument paymentDocument) {
        paymentDocuments.add(PaymentDocument);
    }

    public int getTotalPayments() {
        int total = 0;
        for (PaymentDocument paymentDocument : paymentDocuments) {
            total += paymentDocument.getAmount();
        }
        return total;
    }

    // следующий метод удаляет платеж с данным номером, номером договора и датой.
    // Если найдется совпадение, то это также удаляется из списка и цикл заканчивается.

    public void removePayment(int paymentNumber, String contractNumber, String date) {
        for (PaymentDocument paymentDocument : paymentDocuments) {
            if (paymentDocument.getNumber() == paymentNumber && paymentDocument.getContractNumber().equals(contractNumber)
                    && paymentDocument.getDate().equals(date)) {
                paymentDocuments.remove(paymentDocument);
                break;
            }

        }
    }
}