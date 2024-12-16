package ma.project.gestion_hotel.config;



import ma.project.gestion_hotel.soapService.ClientSoapService;
import ma.project.gestion_hotel.soapService.ReservationSoapService;
import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus;

    @Autowired
    private ReservationSoapService reservationSoapService;


    @Autowired
    private ClientSoapService clientSoapService;
    @Bean

    public EndpointImpl clientEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, clientSoapService);
        endpoint.publish("/client");
        return endpoint;
    }

    @Bean
    public EndpointImpl reservationEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, reservationSoapService);
        endpoint.publish("/reservation");
        return endpoint;
    }

}



