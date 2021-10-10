package aulacontrole;
public class ControleRemoto implements Controlador{
    private int volume;
    private boolean tocando;
    private boolean ligado;
    
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;            
    
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setVolume(false);
    }

    @Override
    public void abrirMenu() {     
        System.out.println("Esta ligao? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.print("volume: " +this.getVolume());
        for(int i = 0; i <= this.getVolume(); i +=10){
        
            System.out.print("[]");     
        
        }
            

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(getVolume() + 5);
        }
        
    }

    @Override
    public void menosVolume() {
        if(getLigado() && getVolume() > 0){
            this.setVolume(getVolume() -5);
        
        }        
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0 ){
            this.setVolume(0);
    
    }
        
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        
        }
    }

    @Override
    public void play() {
        if(getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
        
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        
        }
    }
    
    
}
