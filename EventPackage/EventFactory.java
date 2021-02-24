package EventPackage;
import Utility.*;
public class EventFactory {
   public Event getEvent(DefaultEvents event)
   {
      switch (event) {
         case WEDDINGEVENT:
            return new WeddingEvent();

         default:
            return null;
      }
   }
}
