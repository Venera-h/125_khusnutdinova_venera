package base;
// описываем платежный документ
public class PaymentDocument {
    private int amount;// сумма платежа в копейках
    private int number;//номер документа
    private PaymentDocumentType type;// тип платежного документа ( платежное поручение или банковский ордер)
    private String contractNumber;// номер договора, к которому относится платежный документ
    private String date; // дата платежа в заданном формате (строка формата "YYYYMMDD", где Y - год, M - месяц, D - день)
    public PaymentDocument(int amount, int number, PaymentDocumentType type, String contractNumber, String date) {
        this.amount = amount;
        this.number = number;
        this.type = type;
        this.contractNumber = contractNumber;
        this.date = date;
    }
    public int getAmount() {
        return amount;// возращает сумму платежа
    }
    public int getNumber() {
        return number;//возращает номер платежного документа
    }
    public PaymentDocumentType getType() {
        return type;// возвращает тип
    }
    public String getContractNumber() {
        return contractNumber;// возращает номер договора
    }
    public String getDate() {
        return date;// возращает дату платежа

    }

}
