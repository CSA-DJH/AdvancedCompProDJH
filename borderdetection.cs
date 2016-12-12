using UnityEngine;
using System.Collections;

public class borderdetection : MonoBehaviour
{
	void OnTriggerExit(Collider other)
	{
		Destroy(other.gameObject);
	}
}