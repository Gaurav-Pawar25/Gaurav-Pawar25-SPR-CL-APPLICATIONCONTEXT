package Lab;

import Lab.Beans.ElectricEngine;
import Lab.Beans.GasEngine;
import Lab.Beans.NuclearEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Lab {
    /**
     * Notice that the ApplicationContext is itself a bean that can be retrieved from the Spring IOC container
     * (in a sense, from itself, since this is now a Bean used to retrieve Beans)
     */
    @Autowired
    ApplicationContext applicationContext;

    /**
     * Retrieves the ElectricPoweredBean from the ApplicationContext by requesting a bean of the class
     * ElectricEngine. There is no need to modify this method.
     * @return an ElectricEngine bean
     */
    @Bean
    public ElectricEngine getElectricPoweredBean(){
        return new ElectricEngine();
    }
    /**
     * TODO: Retrieve an GasEngine bean and return it.
     * @return a GasEngine bean
     */
    @Bean
    public GasEngine getGasPoweredBean(){
        return new GasEngine();
    }
    /**
     * TODO: Retrieve a NuclearEngine bean and return it.
     * @return a NuclearEngine bean
     */
    @Bean
    public NuclearEngine getNuclearPoweredBean(){
        return new NuclearEngine();
    }
}
