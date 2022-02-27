//interface haven't concrete methodes, only abstracts
//who join the interface follow some rules
    //Needs to implement all the interface's methodes
        //setSenha
        //autentica

public abstract interface Autenticavel {

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);

}