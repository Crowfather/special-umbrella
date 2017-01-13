using UnityEngine;
using System.Collections;
using UnityEngine.UI;
using UnityEngine.SceneManagement;

public class Timer : MonoBehaviour
{


    public float timeremaining = 60;
    public Text TimerText;
    // Use this for initialization
    void Start()
    {
        TimerText = GetComponent<Text>();
    }


    void Update()
    {

        timeremaining -= Time.deltaTime; /// uppdate the ramaining time in a Descending order
    }
    public void RestartGame()
    {
        SceneManager.LoadScene(SceneManager.GetActiveScene().name); // loads current scene
    }

    void OnGUI() ///
    {
        if (timeremaining > 0)
        {
            TimerText.text = "Time remaing: " + (int)timeremaining;
        }
        else
        {
            //GUI.Label(new Rect(100, 100, 200, 100), "Time is up ");
            RestartGame();
        }
    }
}