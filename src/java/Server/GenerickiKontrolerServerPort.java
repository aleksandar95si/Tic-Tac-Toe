/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Server_client.GenerickiKontrolerServer;
import Server_client.TransferObjekat;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 * REST Web Service
 *
 * @author aleks
 */
@Path("generickikontrolerserverport")
public class GenerickiKontrolerServerPort {

    private GenerickiKontrolerServer port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenerickiKontrolerServerPort
     */
    public GenerickiKontrolerServerPort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method prvaMetoda
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<Server_client.TransferObjekat>
     */
    @POST
    @Produces("application/xml")
    @Consumes("application/xml")
    @Path("prvametoda/")
    public JAXBElement<TransferObjekat> postPrvaMetoda(JAXBElement<TransferObjekat> arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                Server_client.TransferObjekat result = port.prvaMetoda(arg0.getValue());
                return new JAXBElement<Server_client.TransferObjekat>(new QName("http//Server_client/", "transferobjekat"), Server_client.TransferObjekat.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private GenerickiKontrolerServer getPort() {
        try {
            // Call Web Service Operation
            Server_client.GenerickiKontrolerServer_Service service = new Server_client.GenerickiKontrolerServer_Service();
            Server_client.GenerickiKontrolerServer p = service.getGenerickiKontrolerServerPort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
