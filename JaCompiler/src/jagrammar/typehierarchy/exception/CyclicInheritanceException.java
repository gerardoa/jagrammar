package jagrammar.typehierarchy.exception;

public class CyclicInheritanceException extends RuntimeException{

        private String className;

        public CyclicInheritanceException(String className) {
            this.className = className;
        }


        @Override
	public String getMessage(){
		return "Cyclic inheritance involving class " + className;
	}
}