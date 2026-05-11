
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _GetProduit_QNAME = new QName("http://webservice.soap_provider.soap.org/", "getProduit");
    private static final QName _GetProduitResponse_QNAME = new QName("http://webservice.soap_provider.soap.org/", "getProduitResponse");
    private static final QName _ListeProduits_QNAME = new QName("http://webservice.soap_provider.soap.org/", "listeProduits");
    private static final QName _ListeProduitsResponse_QNAME = new QName("http://webservice.soap_provider.soap.org/", "listeProduitsResponse");
    private static final QName _Produit_QNAME = new QName("http://webservice.soap_provider.soap.org/", "produit");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProduit }
     * 
     * @return
     *     the new instance of {@link GetProduit }
     */
    public GetProduit createGetProduit() {
        return new GetProduit();
    }

    /**
     * Create an instance of {@link GetProduitResponse }
     * 
     * @return
     *     the new instance of {@link GetProduitResponse }
     */
    public GetProduitResponse createGetProduitResponse() {
        return new GetProduitResponse();
    }

    /**
     * Create an instance of {@link ListeProduits }
     * 
     * @return
     *     the new instance of {@link ListeProduits }
     */
    public ListeProduits createListeProduits() {
        return new ListeProduits();
    }

    /**
     * Create an instance of {@link ListeProduitsResponse }
     * 
     * @return
     *     the new instance of {@link ListeProduitsResponse }
     */
    public ListeProduitsResponse createListeProduitsResponse() {
        return new ListeProduitsResponse();
    }

    /**
     * Create an instance of {@link Produit }
     * 
     * @return
     *     the new instance of {@link Produit }
     */
    public Produit createProduit() {
        return new Produit();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProduit }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.soap_provider.soap.org/", name = "getProduit")
    public JAXBElement<GetProduit> createGetProduit(GetProduit value) {
        return new JAXBElement<>(_GetProduit_QNAME, GetProduit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduitResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProduitResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.soap_provider.soap.org/", name = "getProduitResponse")
    public JAXBElement<GetProduitResponse> createGetProduitResponse(GetProduitResponse value) {
        return new JAXBElement<>(_GetProduitResponse_QNAME, GetProduitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeProduits }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListeProduits }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.soap_provider.soap.org/", name = "listeProduits")
    public JAXBElement<ListeProduits> createListeProduits(ListeProduits value) {
        return new JAXBElement<>(_ListeProduits_QNAME, ListeProduits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeProduitsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListeProduitsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.soap_provider.soap.org/", name = "listeProduitsResponse")
    public JAXBElement<ListeProduitsResponse> createListeProduitsResponse(ListeProduitsResponse value) {
        return new JAXBElement<>(_ListeProduitsResponse_QNAME, ListeProduitsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Produit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Produit }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.soap_provider.soap.org/", name = "produit")
    public JAXBElement<Produit> createProduit(Produit value) {
        return new JAXBElement<>(_Produit_QNAME, Produit.class, null, value);
    }

}
