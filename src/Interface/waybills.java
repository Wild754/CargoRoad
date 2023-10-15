package Interface;
import java.util.Date;

public class waybills extends Product{
        private int invoiceNumber;
        private Date timestamp;

    public waybills(String newProd, String countProd, String categoryProd,int wayNumber) {
        super(newProd, countProd, categoryProd);
        this.invoiceNumber = wayNumber;
        this.timestamp = new Date();
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = addProd();
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}

