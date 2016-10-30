package mykotlinclasses

/**
 * Created by rkodekar on 10/30/16.
 */
public class ServiceFactory {

    // null checks
    public fun activateService(service : Service?) {
        if (service != null) {
        }
    }

    // smart cast
    private fun createService(obj: Any) {
        if (obj is Service) {
            obj.activate("Rehan")
        }
    }
}
