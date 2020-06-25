public class Drink implements Jihanki{

	// ���i��
	public String mName;

	// �R���X�g���N�^
	public Drink() {
		mName = "���ݕ�"; // �����l
	}

	// �����ꂽ�{�^���ɂ���ď��i�����肷��
	public void setItem(int button) {
		switch (button) {
		case 1:
			mName = "�R�[��";
			break;
		case 2:
			mName = "����";
			break;
		case 3:
			mName = "Dr Peppar";
			break;
		default:
			mName = "�G���[!";
		}
	}

	// ���i�����擾����
	public String getItem() {
		return mName;
	}
}
