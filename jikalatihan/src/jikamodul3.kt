import java.util.*

fun main (args: Array<String>){
    pembelianBarang()
}

fun pembelianBarang () {
    var scan = Scanner(System.`in`)
    do {
    println("1. jumlah barang")
    println("2. exit")
    var pilih = scan.nextInt()
        if (pilih == 1) {
            println("masukkan jumlah barang ")
            val jumlahBarang = scan.nextInt()
            var harga = 10000
            var jumlahHarga = jumlahBarang * harga
            if (jumlahBarang <= 100) {
                println(jumlahHarga)
            }
            else if (jumlahBarang >= 100 && jumlahBarang < 150) {
                harga = 9500
                jumlahHarga = harga * jumlahBarang
                println(jumlahHarga)
            }
            else if (jumlahBarang >= 150) {
                harga = 9000
                jumlahHarga = harga * jumlahBarang
                println(jumlahHarga)
            }
        }
        if(pilih==2)
            println("terimakasih ")
    }while(pilih!=2)
}
