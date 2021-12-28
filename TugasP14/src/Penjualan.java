public interface Penjualan {

  public void NoFaktur();

  public void NamaBarang();

  public void HargaBarang();

  public Integer SubTotal(); // subtotal = HargaBarang * jumlah;

  public Double Discount();

  public void TotalHarga(); // totalharga = subtotal * (1 - discount);
}
