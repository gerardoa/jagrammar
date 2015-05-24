#Descrizione del driver per il compilatore Ja

# Introduzione #

Il processo di compilazione è suddiviso in due fasi. A ciascuna fase corrisponde una grammatica descritta dal linguaggio di Antlr.
Per ogni grammatica, Antlr genera una classe Java, che rappresenta il parser in grado di riconoscere il linguaggio derivabile dalla grammatica.
Compito del driver è quello di far interagire tra loro le due fasi della compilazione, passando il risultato della prima fase alla seconda.

# In dettaglio #

Il primo compito del driver è quello di offrire un'interfaccia all'utente ed elaborare l'input fornito, controllandone la correttezza tramite espressioni regolari.

Prima di iniziare la prima fase della compilazione, la tabella contenente le interfacce delle classi, è inizializzata con le classi predefinite del linguaggio: Object, String, Class. In questo modo qualora si presenti l'occorrenza di una delle suddette classi, verrà  utilizzata l'istanza predefinita, senza ricercare un file per la classe. Se ne deduce che non è possibile compilare file con i seguenti nomi: Object.java, String.java, Class.java, giustificato dall'assenza di namespace che renderebbe indistinguibili tali classi dalle classi del linguaggio.





# Uso #

Il compilatore cercherà le classi da verificare ed eventuali classi referenziate, all'interno di una singola directory specificata in input. Se non specificata si assume quella corrente.

E' possibile lanciare il compilatore da riga di comando digitando:

`java -jar JaCompiler.jar -p [<classPath>] <Classe1.java> [<Classe2.java> ...]`

classPath: directory dove cercare le classi specificate.

Classe#.java: nome del file contenente la classe java da compilare.