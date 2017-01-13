using UnityEngine;
using System.Collections;
using UnityEngine.UI;
using UnityEngine.SceneManagement;

public class displayPoints : MonoBehaviour
{


    public int points = 0;
    public Text pointText;
    // Use this for initialization
    void Start()
    {
        pointText = GetComponent<Text>();
    }


    void Update()
    {
    }
    void OnGUI()
    {
        
        pointText.text = "Score:  " + (int)points;
        
        
    }
}