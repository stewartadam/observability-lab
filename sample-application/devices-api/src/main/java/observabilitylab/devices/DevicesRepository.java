package observabilitylab.devices;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;

import observabilitylab.devices.model.Device;




@Repository
public interface DevicesRepository extends CosmosRepository<Device, String> {
    
    List<Device> findAll();
    
    Device getDeviceById(String deviceId);
    void deleteDeviceById(String deviceId);
}
