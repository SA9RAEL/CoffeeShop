import java.awt.Color
import java.awt.Color.red

// ������� ������, � ���� ����� 3 �������, ���� ������, ����, �����.
// ������������ - ������
// ������������ - ���� ������
// ������������ - ���� ������, ���� ������,
// ������������ - ���� ������, ���� ������, �����

// ������� �� github � ������� �����������

class Car() {
    private val color = red
    private val price = 45000
    private val brand = "Lada"
    constructor(
    color: Color,
    price: Int,
    brand: String
    ) : this() {
        this.color
        this.price
        this.brand
    }

}
