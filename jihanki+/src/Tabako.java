public class Tabako implements Jihanki {

	// ���i��
	public String mName;

	// �R���X�g���N�^
	public Tabako() {
		mName = "�^�o�R"; // �����l
	}

	// �����ꂽ�{�^���ɂ���ď��i�����肷��
	public void setItem(int button) {
		switch (button) {
		case 1:
			mName = "�Z�u���X�^�[";
			break;
		case 2:
			mName = "�}���{��";
			break;
		case 3:
			mName = "�킩��";
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
