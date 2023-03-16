package JourneyOfTaroSpringTestV1.groupid.artefact.exceptions;

import java.io.Serial;

public class RecordNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public RecordNotFoundException() {

        super();

    }

    public RecordNotFoundException(String message) {

        super(message);

    }

}
