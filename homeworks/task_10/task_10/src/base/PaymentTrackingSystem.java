package base;
import java.util.ArrayList;
import java.util.List;
public class PaymentTrackingSystem {
    private List<Contract> contracts;
    private List<PaymentDocument> paymentDocuments;

    public PaymentTrackingSystem(){
        contracts = new ArrayList<>();
        paymentDocuments = new ArrayList<>();
    }
    public void addContract(String number, String date) {
        contracts.add(new Contract(number, date));
    }
    public void addPaymentDocument(int amount, int number, PaymentDocumentType type,
                                   String contractNumber, String date){
        paymentDocuments.add(new PaymentDocument(amount, number, type, contractNumber, date));
    }
    public List<PaymentDocument> getPaymentsForContract(String contractNumber) {
        List<PaymentDocument> payments = new ArrayList<>();
        for (PaymentDocument paymentDocument : paymentDocuments) {
            if (paymentDocument.getContractNumber().equals(contractNumber)) {
                payments.add(paymentDocument);
            }// здесь осуществляется проверка
        }
        return payments;
    }//поиск всех платежей по договору с заданным номером

    public int getTotalAmountForContract(String contractNumber) {
        int totalAmount = 0;
        for (PaymentDocument paymentDocument : paymentDocuments) {
            if (paymentDocument.getContractNumber().equals(contractNumber)) {
                totalAmount += paymentDocument.getAmount();
            }
        }
        return totalAmount;
    }
    //получаем общую сумму всех платежей, зареганных длая договора с заданным номером.

    public void removePayment(int paymentNumber, String contractNumber, String date) {
        for (PaymentDocument paymentDocument : paymentDocuments) {
            if (paymentDocument.getNumber() == paymentNumber && paymentDocument.getContractNumber().equals(contractNumber)
                    && paymentDocument.getDate().equals(date)) {
                paymentDocuments.remove(paymentDocument);
                break;
            }
        }
    }// удаляет платеж из списка платежей путем перебора, если находится платеж с соответсвующими данными, то система удаляет его из списка

    public List<Contract> getContracts() {
        return contracts;// нужна для предоставления информации о договарах, хранящихся в этом классе
    }


}
