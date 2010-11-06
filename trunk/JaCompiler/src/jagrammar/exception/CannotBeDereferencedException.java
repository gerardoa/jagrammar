package jagrammar.exception;

/**
 *
 * @author IlianaPetrova
 */
public class CannotBeDereferencedException extends JaCompileException{
        private String variableType;

        public CannotBeDereferencedException(String variableType, int line, int pos) {
            super(line, pos);
            this.variableType = variableType;
        }

        @Override
	public String getMessage(){
            return variableType  + " cannot be dereferenced";
	}
}
