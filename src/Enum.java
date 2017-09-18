/**
 * Created by abarajas on 6/30/17.
 */
public class Enum implements TryStuff {

// public enum Countries {
//        US("United States"),
//        CAD("Canada");

    public enum EKYCDocumentRejectReason {

        NONE,
        DOCUMENT_EXPIRED,
        DOCUMENT_NOT_SUPPORTED,
        DOCUMENT_NOT_RELATED_TO_USER,
        DOCUMENT_NOT_READABLE,
        DOCUMENT_SUSPICIOUS,
        DOCUMENT_VENDOR_UPLOAD_FAILED,
        OTHER;

//        String name;
//
//        Countries(String name) {
//            this.name = name;
//        }
//
//        public String getName() {
//            return name;
//        }
    }

    @Override
    public void tryMethod() {
//        System.out.println("This is printing with toString() method: " + Countries.CAD.toString());
//        System.out.println("This is printing with toName() method: " + Countries.US.name());
//        System.out.println("Printing with nothing" + Countries.US);
//        System.out.println("Printing Countries.values(): " + Countries.values());
//        System.out.println("this.name().toString() method: " + Countries.CAD.name().toString());
//        System.out.println(Countries.CAD.getName());

        EKYCDocumentRejectReason enumerated = EKYCDocumentRejectReason.DOCUMENT_EXPIRED;

        System.out.println("This is printing with name() method: " + enumerated.name());
        System.out.println("This is printing with name().toString() method: " + enumerated.name().toString());
        System.out.println("This is printing with toString() method: " + enumerated.toString());

    }
}
