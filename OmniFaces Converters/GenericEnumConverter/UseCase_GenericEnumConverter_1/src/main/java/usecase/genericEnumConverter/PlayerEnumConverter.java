package usecase.genericEnumConverter;

import javax.faces.convert.EnumConverter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Anghel Leonard
 */
@FacesConverter("playerEnumConverter")
public class PlayerEnumConverter extends EnumConverter {

    public PlayerEnumConverter() {
        super(PlayerEnum.class);
    }
}
